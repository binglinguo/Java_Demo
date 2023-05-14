//这里放一些公共的js方法
function getUserInfo(pageName){
    $.ajax({
        type:'get',
        url:'login',
        success:function(body){
            if(body.userId && body.userId > 0){
                //有效的登录状态
                console.log("登录成功 用户名为：" + body.userName);

                if (pageName == 'blog_list.html') {
                    changeUserName(body.userName);
                }
            }else {
                //如果未登录弹窗告诉未登录要进行登录
                alert("您当前未登录 请登录后再试");
                location.assign('blog_login.html');
            }
        },
        error:function(){
            alert("您当前未登录 请登录后再试");
            location.assign('blog_login.html');
        }
    });
}


function changeUserName(username) {
    let h3 = document.querySelector('.card>h3');
    h3.innerHTML = username;
}