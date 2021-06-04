# 工程简介
实现一个可动态配置的定时任务，支持停止，修改，重启

参考博客：https://www.cnblogs.com/mengq0815/p/10596073.html

```sql
INSERT INTO `tbl_scheduled_task` VALUES (1, '2021-06-03 17:06:37', 1, '0/2 * * * * ?', '定时任务01', 'scheduledTask01', '2021-06-03 17:06:37', b'0');
INSERT INTO `tbl_scheduled_task` VALUES (2, '2021-06-03 17:06:37', 0, '0/5 * * * * ?', '定时任务02', 'scheduledTask02', '2021-06-03 17:06:37', b'0');
INSERT INTO `tbl_scheduled_task` VALUES (3, '2021-06-03 17:06:37', 0, '0/2 * * * * ?', '定时任务03', 'scheduledTask03', '2021-06-03 17:06:37', b'0');
```
# 延伸阅读

