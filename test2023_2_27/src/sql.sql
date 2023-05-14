select id from course where name in ('语文','英文');
select score from score where score.course_id in (select id from course where name in ( '语文','英文'));