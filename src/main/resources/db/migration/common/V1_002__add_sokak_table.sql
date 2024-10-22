
-- Yeni sokak tablosunu oluşturma
CREATE TABLE sokak (
                       id SERIAL PRIMARY KEY,
                       isim VARCHAR(255),
                       mahalle_id BIGINT,
                       CONSTRAINT fk_mahalle FOREIGN KEY(mahalle_id) REFERENCES mahalle(id)
);
