
create database if not exists blog;

use blog;
-- 创建内容库
drop table if exists blog;
-- 如果这个表存在 那么就把这个表删除掉

create table blog(
    blogId int primary key auto_increment,
    title varchar(1024),-- 标题
    content mediumtext,-- 内容
    userId int,-- 文章作者的id
    posttime datetime -- 文章的发布时间
);

insert into blog values(null, '这是第一篇博客', '从今天开始, 我要认真学 Java', 1, now());
insert into blog values(null, '这是第二篇博客', '从昨天开始, 我要认真学 Java', 1, now());
insert into blog values(null, '这是第三篇博客', '从前天开始, 我要认真学 Java', 1, now());
insert into blog values(null, '这是第一篇博客', '从今天开始, 我要认真学 C++', 2, now());
insert into blog values(null, '这是第二篇博客', '从昨天开始, 我要认真学 C++', 2, now());
insert into blog values(null, '这是第三篇博客', '# 一级标题\n ### 三级标题\n > 这是引用内容', 2, now());

--创建用户
drop table if exists user;
--如果库存在则删除掉
create table user(
    userId int primary key auto_increment,
    username varchar(128) unique,
    password varchar(128)
);

insert into user values(null,"zhangsan","123");
insert into user values(null,"lisi","123");