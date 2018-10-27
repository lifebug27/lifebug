INSERT INTO darsad67es2t64."public".participant (first_name, second_name, patronymic, telephone_number, photo)
VALUES ('Gena', 'Van', 'B', '123', 'photo');

INSERT INTO darsad67es2t64."public".participant (first_name, second_name, patronymic, telephone_number, photo)
VALUES ('Kolya', 'Potapov', 'B', '123', 'photo');

INSERT INTO darsad67es2t64."public".participant (first_name, second_name, patronymic, telephone_number, photo)
VALUES ('Ivan', 'Nekrasov', 'B', '123', 'photo');

INSERT INTO darsad67es2t64."public".participant (first_name, second_name, patronymic, telephone_number, photo)
VALUES ('Maks', 'Cha', 'B', '123', 'photo');

INSERT INTO darsad67es2t64."public".organiser (first_name, second_name, patronymic, telephone_number, photo)
VALUES ('Gena', 'Van', 'B', '123', 'photo');

INSERT INTO darsad67es2t64."public".organiser (first_name, second_name, patronymic, telephone_number, photo)
VALUES ('Kolya', 'Potapov', 'B', '123', 'photo');

INSERT INTO darsad67es2t64."public".organiser (first_name, second_name, patronymic, telephone_number, photo)
VALUES ('Ivan', 'Nekrasov', 'B', '123', 'photo');

INSERT INTO darsad67es2t64."public".organiser (first_name, second_name, patronymic, telephone_number, photo)
VALUES ('Maks', 'Cha', 'B', '123', 'photo');

INSERT INTO darsad67es2t64.public.event (date, event_name, event_time)
VALUES ('27.10.2018', 'Hack starts', '13:00');

INSERT INTO darsad67es2t64.public.event (date, event_name, event_time)
VALUES ('28.10.2018', 'Hack ends', '13:00');

INSERT INTO darsad67es2t64.public.event (date, event_name, event_time)
VALUES ('28.10.2018', 'Hack breakfast', '8:00');

INSERT INTO darsad67es2t64.public.attendance(event_id, par_id, status)
VALUES (1, 1, 'true');

INSERT INTO darsad67es2t64.public.attendance(event_id, par_id, status)
VALUES (1, 2, 'true');

INSERT INTO darsad67es2t64.public.attendance(event_id, par_id, status)
VALUES (1, 3, 'false');

INSERT INTO darsad67es2t64.public.attendance(event_id, par_id, status)
VALUES (1, 4, 'true');

INSERT INTO darsad67es2t64.public.attendance(event_id, par_id, status)
VALUES (2, 1, 'true');

INSERT INTO darsad67es2t64.public.attendance(event_id, par_id, status)
VALUES (2, 2, 'true');

INSERT INTO darsad67es2t64.public.attendance(event_id, par_id, status)
VALUES (2, 3, 'false');

INSERT INTO darsad67es2t64.public.attendance(event_id, par_id, status)
VALUES (2, 4, 'true');

INSERT INTO people(name, status)
VALUES (Nekrasov, 'no');

INSERT INTO people(name, status)
VALUES (Cha, 'no');

INSERT INTO people(name, status)
VALUES (Van, 'no');

INSERT INTO people(name, status)
VALUES (Kolya, 'no');