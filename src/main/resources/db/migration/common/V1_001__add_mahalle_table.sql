
CREATE TABLE mahalle (
                         id SERIAL PRIMARY KEY,
                         isim VARCHAR(255),
                         ilce_id BIGINT,
                         CONSTRAINT fk_ilce FOREIGN KEY(ilce_id) REFERENCES ilce(id)
);