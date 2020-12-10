CREATE TABLE IF NOT EXISTS `message` (
 
    `id` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `method` varchar(10),
    `text` varchar(255),
    'date' timestamp
);

INSERT INTO message (method, text) VALUES
('GET','Queries using Get can only retrieve data'),
('PUT','Used to replace an existing object.'),
('POST','Sends data to the server to create a new object.'),
('DELETE','Delete removes the specified resource.'),
('PATCH','Used to partially modify a resource.')
ON CONFLICT (method) DO NOTHING;

