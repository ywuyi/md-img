-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('文档管理', '2000', '1', 'KnDoc', 'knowledge/KnDoc/index', 1, 0, 'C', '0', '0', 'knowledge:KnDoc:list', '#', 'admin', sysdate(), '', null, '文档管理菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'knowledge:KnDoc:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'knowledge:KnDoc:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'knowledge:KnDoc:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'knowledge:KnDoc:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'knowledge:KnDoc:export',       '#', 'admin', sysdate(), '', null, '');