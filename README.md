# normal
CREATE TABLE `user` (                                   
          `user_id` int(11) NOT NULL AUTO_INCREMENT,            
          `name` varchar(30) NOT NULL,                          
          `age` tinyint(4) NOT NULL,                            
          `create_time` datetime NOT NULL,                      
          `birthday` date DEFAULT NULL,                         
          `is_valid` tinyint(1) NOT NULL,                       
          `properties` json DEFAULT NULL,                       
          PRIMARY KEY (`user_id`)                               
        ) ENGINE=InnoDB DEFAULT CHARSET=utf8
