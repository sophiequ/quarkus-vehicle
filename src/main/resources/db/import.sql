insert into x_person (p_id, p_dob, p_name)
values (nextval('hibernate_sequence'), '2023-03-15', 'Alice');

insert into x_vehicle(v_id, v_model, v_brand)
values (nextval('hibernate_sequence'), 'Zoe', 'Renault');
insert into x_vehicle(v_id, v_model, v_brand)
values (nextval('hibernate_sequence'), 'Fabia', 'Skoda');
insert into x_vehicle(v_id, v_model, v_brand)
values (nextval('hibernate_sequence'), 'Tucson', 'Hyundai');
