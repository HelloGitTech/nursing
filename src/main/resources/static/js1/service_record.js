$(function() {
    var orderId = $('#orderId').val();
    $('#datagrid').datagrid({
        url: '/servicerecords/'+orderId
    });
    //
    // $("#workerNameButton").click(function () {
    //     var workerName=$("#workerName");
    //     var value = workerName.val();
    //     if(value.length==0)
    //         return;
    //     var selectBox=$("<div></div>");
    //     selectBox.addClass("select4_box");
    //     $.ajax({
    //         "contentType":"application/x-www-form-urlencoded;charset=utf-8",
    //         "type":"get",
    //         url:"/nursingworkers/"+value,
    //         success:function(data){
    //             if(workerName.parent().find(".select4_box").length>0)
    //                 workerName.parent().find(".select4_box").remove();
    //             var ul=$("<ul></ul>");
    //             $.each(data,function(index,item){
    //                 var li=$("<li></li>");
    //                 li.attr("data-id",item.workerSexCode+','+ item.workerAge+','+item.workerPhone);
    //                 li.text(item.workerName);
    //                 li.click(function(){
    //                     workerName.val($(this).text());
    //                     var tmp = $(this).attr("data-id").split(",");
    //                     $("[name='workerSex'][value='"+tmp[0]+"']").prop("checked", "checked");
    //                     $('[name=workerAge]').val(tmp[1]);
    //                     $('[name=workerPhone]').val(tmp[2]);
    //                     $(this).closest(".select4_box").remove();
    //                 });
    //                 ul.append(li);
    //             });
    //             selectBox.append(ul);
    //             workerName.parent().append(selectBox);
    //         }
    //
    //     });
    //
    // });

});

function searchName(paramStr){
    //var workerName=$("#workerName");
    var workerName =  $('#'+paramStr+' input[name=workerName]');
    var value = workerName.val();
    if(value.length==0)
        return;
    var selectBox=$("<div></div>");
    selectBox.addClass("select4_box");
    $.ajax({
        "contentType":"application/x-www-form-urlencoded;charset=utf-8",
        "type":"get",
        url:"/nursingworkers/"+value,
        success:function(data){
            if(workerName.parent().find(".select4_box").length>0)
                workerName.parent().find(".select4_box").remove();
            var ul=$("<ul></ul>");
            $.each(data,function(index,item){
                var li=$("<li></li>");
                li.attr("data-id",item.workerSexCode+','+ item.workerAge+','+item.workerPhone);
                li.text(item.workerName);
                li.click(function(){
                    workerName.val($(this).text());
                    var tmp = $(this).attr("data-id").split(",");
                    $("[name='workerSex'][value='"+tmp[0]+"']").prop("checked", "checked");
                    $('[name=workerAge]').val(tmp[1]);
                    $('[name=workerPhone]').val(tmp[2]);
                    $(this).closest(".select4_box").remove();
                });
                ul.append(li);
            });
            selectBox.append(ul);
            workerName.parent().append(selectBox);
        }

    });
}

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
function saveServiceRecord(){
    var updurl = "/servicerecord";

    $('#fim').form('submit',{
        url: updurl,
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

function addServiceRecord(){
    var orderId = $('#orderId').val();
    var add="/servicerecord";
    $('#fam').form('submit',{
        url: add,
        onSubmit: function(){
            $(this).append('<input type="hidden" name="orderId" value="'+orderId+'">');
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

function searchWorker(){
    var wName = $('#workerName').val();
    $.ajax({
        url: '/nursingworker/'+wName,
        type:'GET',
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

function changeSexType(val){
    if(val==1){
        return "男";
    }else{
        return "女"
    }
}
