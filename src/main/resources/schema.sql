CREATE TABLE rule (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(255),
  condition VARCHAR(1024),
  courier_partner VARCHAR(255)
);
