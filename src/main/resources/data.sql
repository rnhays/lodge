INSERT INTO PERSON (first_name, last_name, middle_init) VALUES ('RICHARD', 'HAYS','N');
INSERT INTO PERSON (first_name, last_name, middle_init) VALUES ('JOE','SMITH','');
INSERT INTO PERSON (first_name, last_name, middle_init) VALUES ('JANE','DOE','');
INSERT INTO ADDRESS (STREET_ADDRESS_1,STREET_ADDRESS_2, CITY, STATE, ZIP) VALUES ('1025 Robert Drive', 'Suite 101','Maryville','IL', '62062-6264');
INSERT INTO person_addresses (person_person_id, addresses_address_id) VALUES (2,1);
INSERT INTO organization (name) VALUES ('NEILSON');
INSERT INTO organization_addresses (organization_org_id, addresses_address_id) VALUES (1,1);