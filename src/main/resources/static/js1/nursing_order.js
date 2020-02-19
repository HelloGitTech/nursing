
function newNursingWorker(){
    $('#adddg').dialog('open').dialog('setTitle','添加');
    //数据清空
    $('#fam').form('clear');

}

function editNursingWorker(){
    //选中某一行
    var row = $('#datagrid').datagrid('getSelected');
    if (row){
        $('#modifydg').dialog('open').dialog('setTitle','修改信息');
        $('#fim').form('load',row);
    }else{
        $.messager.show({
            title: 'Error',
            msg: "请先选择一条记录！"
        });
    }
}




//信息保存按钮事件
function saveNursingWorker(){
    var row = $('#datagrid').datagrid('getSelected');
    var add = "/nursingworker?workerId="+row.workerId;

    $('#fim').form('submit',{
        url: add,
        onSubmit: function(){
            return $(this).form('validate');
        },
        success: function(result){
            var result = eval('('+result+')');
            if (result.success){

                $('#modifydg').dialog('close');		// close the dialog
                $('#datagrid').datagrid('reload');	// reload the user data
                $.messager.show({
                    title: 'Success',
                    msg: '保存成功'
                });
            } else {
                $.messager.show({
                    title: 'Error',
                    msg: result.msg
                });
            }
        }
    });
}

function addNursingWorker(){
    var add="/nursingworker";
    $('#fam').form('submit',{
        url: add,
        onSubmit: function(){
            return $(this).form('validate');
        },
        success: function(result){
            var result = eval('('+result+')');
            if (result.success){

                $('#adddg').dialog('close');		// close the dialog
                $('#datagrid').datagrid('reload');	// reload the user data
                $.messager.show({
                    title: 'Success',
                    msg: '添加成功'
                });
            } else {
                $.messager.show({
                    title: 'Error',
                    msg: result.msg
                });
            }
        }
    });
}


function removeNursingWorker(){
    var row = $('#datagrid').datagrid('getSelected');

    if (row){
        $.messager.confirm('Confirm','确定要删除?',function(r){
            if (r){
                $.ajax({
                   url: '/nursingworker/'+row.workerId,
                    type:'DELETE',
                    success:function f(result) {
                        if (result.success){

                            $('#datagrid').datagrid('reload');	// reload the user data
                            $.messager.show({
                                title: 'Success',
                                msg: '删除成功'
                            });
                        } else {
                            $.messager.show({	// show error message
                                title: 'Error',
                                msg: result.msg
                            });
                        }
                    }
                });
            }
        });
    }
}

function servicerecords(title){
    var row = $('#datagrid').datagrid('getSelected');
    var uurl = '/servicerecord/listpage/'+row.orderId;
    if (row) {
        if ($('#ordlist').tabs('exists', title)) {
            $('#ordlist').tabs('select', title);
        } else {
            var content = '<iframe scrolling="auto" frameborder="0"  src='+uurl+' style="width:100%;height:100%;"></iframe>';
            $('#ordlist').tabs('add', {
                title: title,
                content: content,
                closable: true
            });
        }
    }else{
        $.messager.show({
            title: 'Error',
            msg: "请先选择一条记录！"
        });
    }
}

function changeSexType(val){
    if(val==1){
        return "男";
    }else{
        return "女"
    }
}
function changeServiceType(val){
    if(val== 1){
        return "月月护";
    }else{
        return "单项/套餐";
    }
}



