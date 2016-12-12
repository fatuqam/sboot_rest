CREATE TABLE contacts (
  id SERIAL PRIMARY KEY,
  name TEXT,
  email TEXT
);

INSERT INTO  contacts(name,email) values ('wassim', 'wass@example.com');