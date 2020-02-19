
function newNursingService(){
    $('#adddg').dialog('open').dialog('setTitle','添加');
    //数据清空
    $('#fam').form('clear');

}

function editNursingService(){
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
function saveNursingServices(){
    var row = $('#datagrid').datagrid('getSelected');
    var add = "/nursingservice?serviceId="+row.serviceId;

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

function addNursingService(){
    var add="/nursingservice";
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


function removeNursingService(){
    var row = $('#datagrid').datagrid('getSelected');

    if (row){
        $.messager.confirm('Confirm','确定要删除?',function(r){
            if (r){
                $.ajax({
                   url: '/nursingservice/'+row.serviceId,
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


function changeServiceType(val){
    if(val==1){
        return "月月护";
    }else{
        return "单项/套餐"
    }
}

