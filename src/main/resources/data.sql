INSERT INTO RULE(name, condition, courier_partner) VALUES
('Food Instant IN','#order.orderType == "FOOD" && #order.deliveryType == "INSTANT" && #order.country == "IN"','A');

INSERT INTO RULE(name, condition, courier_partner) VALUES
('Food Express IN','#order.orderType == "FOOD" && #order.deliveryType == "EXPRESS" && #order.country == "IN"','B');

INSERT INTO RULE(name, condition, courier_partner) VALUES
('Scheduled Delivery','#order.deliveryType == "SCHEDULED"','B');
