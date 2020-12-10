CREATE TABLE IF NOT EXISTS message (

    id SERIAL primary key NOT NULL,
    method varchar(10),
    text varchar(255),
    date timestamp
);


