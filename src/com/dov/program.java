package com.dov;

import java.util.Scanner;

public class program {
    public static void main(String[] args)
    {
        community c = new community();

        Scanner reader = new Scanner(System.in);
        int choose;
        do {
            System.out.println("please choose a number between 0-4");
            System.out.println("0- exit");
            System.out.println("1- add a community member");
            System.out.println("2- the tax amount of all community members per month");
            System.out.println("3- request for a loan from a community member");
            System.out.println("4- list of volunteer hours of all community members");
            choose = reader.nextInt();

            switch (choose)
            {
                case 0:
                    break;
                case 1:
                    addCommunityMember(reader, c);
                    break;
                case 2:
                    sumTaxAllCommunityMembers(c);
                    break;
                case 3:
                    requestForGemach(reader, c);
                    break;
                case 4:
                    listHoursVolunteering(c);
                    break;
                default:
                    System.out.println("ERROR INPOUTE!");
                    break;
            }

        }while (choose != 0);
    }

    private static void listHoursVolunteering(community c) {
        System.out.println("the list hours of voluteering is:");
        System.out.println(c.sumVoluteering());
    }

    private static void requestForGemach(Scanner reader, community c) {
        int id1;
        System.out.println("please enter id");
        id1 = reader.nextInt();
        System.out.println("the sum to max loan is");
        System.out.println(c.sumGemach(id1));
    }

    private static void sumTaxAllCommunityMembers(community c) {
        System.out.println("the sum of all tax community members ");
        System.out.println(c.texAllMembers());
    }

    private static void addCommunityMember(Scanner reader, community c) {
        int id;
        gen gender = null;
        String name;
        String addres;
        String birthday;
        float sumHoursTorah;
        float sumHoursWork;
        float salary;
        int survivorGemach;
        TypeVolunteering typeVolunteering =null;
        int idOther;
        int numChild;
        int yearsEducation;
        System.out.println("please enter the id");
        id = reader.nextInt();
        int gend;
        do{
            System.out.println("please enter number 0 or 1 to");
            System.out.println("0 - male ");
            System.out.println("1 - female ");
            gend =reader.nextInt();
        }while (gend!=0 & gend !=1);
        switch (gend) {
            case 0:
                gender = gen.male;
                break;
            case 1:
                gender = gen.female;
                break;
        }
        System.out.println("please enter the name");
        name = reader.nextLine();
        System.out.println("please enter the addres");
        addres = reader.nextLine();
        System.out.println("please enter the birthday");
        birthday = reader.nextLine();
        System.out.println("please enter the sum hours of torah ");
        sumHoursTorah = reader.nextFloat();
        System.out.println("please enter the sum hours working ");
        sumHoursWork = reader.nextFloat();
        System.out.println("please enter salary");
        salary=reader.nextFloat();
        System.out.println("please enter survivor gemach");
        survivorGemach = reader.nextInt();
        int typeV;
        do{
            System.out.println("please enter a nember for type of volunteering ");
            System.out.println("0 - spiritually ");
            System.out.println("1 - physically");
            System.out.println("2 - musical");
            typeV = reader.nextInt();
        }while (typeV!=0 & typeV!=1 &typeV!=2);
        switch (typeV){
            case 0:
                typeVolunteering = TypeVolunteering.spiritually;
                break;
            case 1:
                typeVolunteering = TypeVolunteering.physically;
                break;
            case 2:
                typeVolunteering = TypeVolunteering.musical;
                break;
        }
        int status;
        do{
            System.out.println("please enter the status");
            System.out.println("0 - single ");
            System.out.println("1 - married");
            status = reader.nextInt();
        }while(status!=0 & status!=1);
        switch (status)
        {
            case 0:
                System.out.println("please enter the sum years education");
                yearsEducation = reader.nextInt();
                c.addMember(new single( id, gender, name, addres,
                        birthday,  sumHoursTorah, sumHoursWork,
                        salary,  survivorGemach,typeVolunteering,
                        yearsEducation));
                break;
            case 1:
                System.out.println("please enter the other id");
                idOther = reader.nextInt();
                System.out.println("please enter the sum of child");
                numChild = reader.nextInt();
                c.addMember(new married( id,  gender, name, addres, birthday, sumHoursTorah,  sumHoursWork,
                        salary,  survivorGemach,typeVolunteering, idOther, numChild));
                break;
        }
    }
}

