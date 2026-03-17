-- Encuesta
INSERT INTO survey (id, name, intro) VALUES (1, 'Customer Satisfaction', 'Intro survey');

-- Secciones
INSERT INTO section (id, title, survey_id) VALUES (1, 'General', 1);
INSERT INTO section (id, title, survey_id) VALUES (2, 'Product', 1);

-- Preguntas
INSERT INTO question (id, name, type, section_id) VALUES (1, 'How satisfied are you?', 'multiple choice', 1);
INSERT INTO question (id, name, type, section_id) VALUES (2, 'Would you recommend us?', 'yes/no', 1);
INSERT INTO question (id, name, type, section_id) VALUES (3, 'Rate the product', 'rating', 2);

-- Respuestas
INSERT INTO answer (id, answer, question_id) VALUES (1, 'Very satisfied', 1);
INSERT INTO answer (id, answer, question_id) VALUES (2, 'Somewhat satisfied', 1);
INSERT INTO answer (id, answer, question_id) VALUES (3, 'Not satisfied', 1);

INSERT INTO answer (id, answer, question_id) VALUES (4, 'Yes', 2);
INSERT INTO answer (id, answer, question_id) VALUES (5, 'No', 2);

INSERT INTO answer (id, answer, question_id) VALUES (6, '5 stars', 3);
INSERT INTO answer (id, answer, question_id) VALUES (7, '4 stars', 3);
INSERT INTO answer (id, answer, question_id) VALUES (8, '3 stars', 3);