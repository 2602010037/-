$(function (){


    $.ajax({
        url:"/api/student/list"
    }).done(function (data){
       // console.log(data)
        let html ="";
        data.forEach((element, index) => {
            html+="<tr>"
            html+="<td>"+element.id+"</td>"
            html+="<td>"+element.name+"</td>"
            html+="<td>"+element.password+"</td>"
            html+="<td>"+element.sex+"</td>"
            html+="<td>"+element.age+"</td>"
            html+="<td>"+element.sno+"</td>"

            html+="</tr>"

        })
        $("#studentTb").html(html)
    });

});