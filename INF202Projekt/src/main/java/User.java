/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yigit
 */
class User {
    private int id;
    private String name;
    private String level;
    private String signature;
    private String persontype;
    private String date;
    
            public User (int id, String name, String level, String signature, String persontype, String date) {
            this.id = id;
            this.name = name;
            this.level = level;
            this.signature = signature;
            this.persontype = persontype;
            this.date = date;
        }

        public int getId(){
            return id;
        }

        public String getName(){
            return name;
        }
        public String getLevel(){
            return level;
        }
        public String getSignature(){
            return signature;
        }
        public String getPersontype(){
            return persontype;
        }
        public String getDate(){
            return date;
        }
}
