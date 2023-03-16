select setval('hibernate_sequence', 1000);

insert into x_person (p_id, p_dob, p_name)
values (1, '2023-03-15', 'Alice');

insert into x_vehicle(v_id, v_model, v_brand)
values (1, 'Zoe', 'Renault');
insert into x_vehicle(v_id, v_model, v_brand)
values (2, 'Fabia', 'Skoda');
insert into x_vehicle(v_id, v_model, v_brand)
values (3, 'Tucson', 'Hyundai');

INSERT INTO public.x_rental (r_id, r_discount, r_end, r_start, r_p_id, r_v_id)
VALUES (1, 10.00, '2023-03-16 12:00:00', '2023-03-15 08:00:00', 1, 1);
INSERT INTO public.x_rental (r_id, r_discount, r_end, r_start, r_p_id, r_v_id)
VALUES (2, 10.00, '2023-03-14 12:00:00', '2023-03-11 08:00:00', 1, 2);
