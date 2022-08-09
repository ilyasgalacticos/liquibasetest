CREATE TABLE items(
    id SERIAL PRIMARY KEY NOT NULL,
    name TEXT NOT NULL,
    price INT DEFAULT 0,
    amount INT DEFAULT 0
);

CREATE TABLE categories(
      id SERIAL PRIMARY KEY NOT NULL,
      name TEXT NOT NULL
);