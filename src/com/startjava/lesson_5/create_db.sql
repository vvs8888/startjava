CREATE TABLE Jaegers (
    id SERIAL PRIMARY KEY,
    modelName TEXT,
    mark      CHAR(6),
    height    NUMERIC(5,2),
    weight    NUMERIC(5,2),
    status    TEXT,
    origin    TEXT,
    launch    DATE,
    kaijuKill INTEGER
);