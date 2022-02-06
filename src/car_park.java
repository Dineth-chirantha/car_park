import java.util.Scanner;



import java.util.Scanner;
//car park management system
public class car_park {
    public static void main(String argu[]) {
        Scanner park = new Scanner(System.in);
        //  facultypark pa=new facultypark();
        int collect = 0;
        int option;
        int group;

        int[] FoP = {0, 0, 0};
        int[] FoP_space = {35, 35, 35};


        int[] FoT = {0, 0, 0};
        int[] FoT_space = {35, 35, 35};

        int[] FoM = {0, 0, 0};
        int[] FoM_space = {35, 35, 35};

        int[] FoS = {0, 0, 0};
        int[] FoS_space = {35, 35, 35};

        int[] FoA = {0, 0, 0};
        int[] FoA_space = {35, 35, 35};

        int[] FoL = {0, 0, 0};
        int[] FoL_space= {35, 35, 35};

        // int car=0,bike=0,van=0;
        while (true) {
            System.out.println("Press 1 to enter Faculty of Physics (FOP)");
            System.out.println("Press 2 to enter Faculty of Technology (FOT)");
            System.out.println("Press 3 to enter Faculty of Management (FOM)");
            System.out.println("Press 4 to enter Faculty of Science (FOS)");
            System.out.println("Press 5 to enter Faculty of Art (FOA)");
            System.out.println("Press 6 to enter Faculty of Low (FOL)");


            option = park.nextInt();

            //#####################################################

            if (option == 1) {
                System.out.println("Faculty of Physics (FOP)");
                System.out.println("Press 1 to enter car");
                System.out.println("Press 2 to enter bike");
                System.out.println("Press 3 to enter van");


                System.out.print("Bick Space:  ");
                System.out.println(FoP[0]);
                System.out.print("car Space:  ");
                System.out.println(FoP[1]);
                System.out.print("van Space:  ");
                System.out.println(FoP[2]);
                group = park.nextInt();

                //#####################################################

                if (group == 1) {
                    collect = FoP[0] + 1;
                    FoP[0] = collect;
                    FoP_space[0] = FoP_space[0] - 1;
                    System.out.print("car :");
                    System.out.print(FoP[0]);
                    System.out.print("   ");
                    System.out.print(FoP_space[0]);


                    System.out.print(" van :");
                    System.out.print(FoP[1]);
                    System.out.print("   ");
                    System.out.print(FoP_space[1]);

                    System.out.print(" Bick :");
                    System.out.print(FoP[2]);
                    System.out.print("   ");
                    System.out.println(FoP_space[2]);

                }
                //#####################################################
                else if (group == 2) {

                    FoP[1] = FoP[1] + 1;
                    FoP_space[1] = FoP_space[1] - 1;

                    System.out.print("car :");
                    System.out.print(FoP[0]);
                    System.out.print("   ");
                    System.out.print(FoP_space[0]);


                    System.out.print(" van :");
                    System.out.print(FoP[1]);
                    System.out.print("   ");
                    System.out.print(FoP_space[1]);

                    System.out.print(" Bick :");
                    System.out.print(FoP[2]);
                    System.out.print("   ");
                    System.out.println(FoP_space[2]);

                }

                //#####################################################
                else if (group == 3) {

                    FoP[2] = FoP[2] + 1;
                    FoP_space[2] = FoP_space[2] - 1;

                    System.out.print("car :");
                    System.out.print(FoP[0]);
                    System.out.print("   ");
                    System.out.print(FoP_space[0]);


                    System.out.print(" van :");
                    System.out.print(FoP[1]);
                    System.out.print("   ");
                    System.out.print(FoP_space[1]);

                    System.out.print(" Bick :");
                    System.out.print(FoP[2]);
                    System.out.print("   ");
                    System.out.println(FoP_space[2]);

                }

            }


            //#####################################################

            else if (option == 2) {
                System.out.println("Faculty of Technology (FOT)");
                System.out.println("Press 1 to enter car");
                System.out.println("Press 2 to enter bike");
                System.out.println("Press 3 to enter van");


                System.out.print("Bick Space:  ");
                System.out.println(FoT[0]);
                System.out.print("car Space:  ");
                System.out.println(FoT[1]);
                System.out.print("van Space:  ");
                System.out.println(FoT[2]);
                group = park.nextInt();

                //#####################################################

                if (group == 1) {
                    collect = FoT[0] + 1;
                    FoT[0] = collect;
                    FoT_space[0] = FoT[0] - 1;
                    System.out.print("car :");
                    System.out.print(FoT[0]);
                    System.out.print("   ");
                    System.out.print(FoT_space[0]);


                    System.out.print(" van :");
                    System.out.print(FoT[1]);
                    System.out.print("   ");
                    System.out.print(FoT_space[1]);

                    System.out.print(" Bick :");
                    System.out.print(FoT[2]);
                    System.out.print("   ");
                    System.out.println(FoT_space[2]);

                }
                //#####################################################
                else if (group == 2) {

                    FoT[1] = FoT[1] + 1;
                    FoT_space[1] = FoT_space[1] - 1;

                    System.out.print("car :");
                    System.out.print(FoT[0]);
                    System.out.print("   ");
                    System.out.print(FoT_space[0]);


                    System.out.print(" van :");
                    System.out.print(FoT[1]);
                    System.out.print("   ");
                    System.out.print(FoT_space[1]);

                    System.out.print(" Bick :");
                    System.out.print(FoT[2]);
                    System.out.print("   ");
                    System.out.println(FoT_space[2]);

                }

                //#####################################################
                else if (group == 3) {

                    FoT[2] = FoT[2] + 1;
                    FoT_space[2] = FoT_space[2] - 1;

                    System.out.print("car :");
                    System.out.print(FoT[0]);
                    System.out.print("   ");
                    System.out.print(FoT_space[0]);


                    System.out.print(" van :");
                    System.out.print(FoT[1]);
                    System.out.print("   ");
                    System.out.print(FoT_space[1]);

                    System.out.print(" Bick :");
                    System.out.print(FoT[2]);
                    System.out.print("   ");
                    System.out.println(FoT_space[2]);

                }

            } else if (3 == option) {

                System.out.println("Faculty of Management (FOM)");
                System.out.println("Press 1 to enter car");
                System.out.println("Press 2 to enter bike");
                System.out.println("Press 3 to enter van");


                System.out.print("Bick Space:  ");
                System.out.println(FoM[0]);
                System.out.print("car Space:  ");
                System.out.println(FoM[1]);
                System.out.print("van Space:  ");
                System.out.println(FoM[2]);
                group = park.nextInt();

                //#####################################################

                if (group == 1) {
                    FoM[0] = FoM[0] + 1;

                    FoM_space[0] = FoM[0] - 1;
                    System.out.print("car :");
                    System.out.print(FoM[0]);
                    System.out.print("   ");
                    System.out.print(FoM_space[0]);


                    System.out.print(" van :");
                    System.out.print(FoM[1]);
                    System.out.print("   ");
                    System.out.print(FoM_space[1]);

                    System.out.print(" Bick :");
                    System.out.print(FoM[2]);
                    System.out.print("   ");
                    System.out.println(FoM_space[2]);

                } else if (group == 2) {

                    FoM[1] = FoM[1] + 1;
                    FoM_space[1] = FoM_space[1] - 1;

                    System.out.print("car :");
                    System.out.print(FoM[0]);
                    System.out.print("   ");
                    System.out.print(FoM_space[0]);


                    System.out.print(" van :");
                    System.out.print(FoM[1]);
                    System.out.print("   ");
                    System.out.print(FoM_space[1]);

                    System.out.print(" Bick :");
                    System.out.print(FoM[2]);
                    System.out.print("   ");
                    System.out.println(FoM_space[2]);

                } else if (group == 3) {

                    FoM[2] = FoM[2] + 1;
                    FoM_space[2] = FoM_space[2] - 1;

                    System.out.print("car :");
                    System.out.print(FoM[0]);
                    System.out.print("   ");
                    System.out.print(FoM_space[0]);


                    System.out.print(" van :");
                    System.out.print(FoM[1]);
                    System.out.print("   ");
                    System.out.print(FoM_space[1]);

                    System.out.print(" Bick :");
                    System.out.print(FoM[2]);
                    System.out.print("   ");
                    System.out.println(FoM_space[2]);


                }
            } else if (4 == option) {

                System.out.println("Faculty of Science (FOS)");
                System.out.println("Press 1 to enter car");
                System.out.println("Press 2 to enter bike");
                System.out.println("Press 3 to enter van");


                System.out.print("Bick Space:  ");
                System.out.println(FoS[0]);
                System.out.print("car Space:  ");
                System.out.println(FoS[1]);
                System.out.print("van Space:  ");
                System.out.println(FoS[2]);
                group = park.nextInt();

                //#####################################################

                if (group == 1) {
                    FoS[0] = FoS[0] + 1;

                    FoS_space[0] = FoS[0] - 1;
                    System.out.print("car :");
                    System.out.print(FoS[0]);
                    System.out.print("   ");
                    System.out.print(FoS_space[0]);


                    System.out.print(" van :");
                    System.out.print(FoS[1]);
                    System.out.print("   ");
                    System.out.print(FoS_space[1]);

                    System.out.print(" Bick :");
                    System.out.print(FoS[2]);
                    System.out.print("   ");
                    System.out.println(FoS_space[2]);

                } else if (group == 2) {

                    FoS[1] = FoS[1] + 1;
                    FoS_space[1] = FoS_space[1] - 1;

                    System.out.print("car :");
                    System.out.print(FoS[0]);
                    System.out.print("   ");
                    System.out.print(FoS_space[0]);


                    System.out.print(" van :");
                    System.out.print(FoS[1]);
                    System.out.print("   ");
                    System.out.print(FoS_space[1]);

                    System.out.print(" Bick :");
                    System.out.print(FoS[2]);
                    System.out.print("   ");
                    System.out.println(FoS_space[2]);

                } else if (group == 3) {

                    FoS[2] = FoS[2] + 1;
                    FoS_space[2] = FoS_space[2] - 1;

                    System.out.print("car :");
                    System.out.print(FoS[0]);
                    System.out.print("   ");
                    System.out.print(FoS_space[0]);


                    System.out.print(" van :");
                    System.out.print(FoS[1]);
                    System.out.print("   ");
                    System.out.print(FoS_space[1]);

                    System.out.print(" Bick :");
                    System.out.print(FoS[2]);
                    System.out.print("   ");
                    System.out.println(FoS_space[2]);

                }
            }
                //#####################################################################

                else if (5 == option) {

                    System.out.println("Faculty of Art (FOA)");
                    System.out.println("Press 1 to enter car");
                    System.out.println("Press 2 to enter bike");
                    System.out.println("Press 3 to enter van");


                    System.out.print("Bick Space:  ");
                    System.out.println(FoA[0]);
                    System.out.print("car Space:  ");
                    System.out.println(FoA[1]);
                    System.out.print("van Space:  ");
                    System.out.println(FoA[2]);
                    group = park.nextInt();

                    //#####################################################

                    if (group == 1) {
                        FoA[0] = FoA[0] + 1;

                        FoA_space[0] = FoA[0] - 1;
                        System.out.print("car :");
                        System.out.print(FoA[0]);
                        System.out.print("   ");
                        System.out.print(FoA_space[0]);


                        System.out.print(" van :");
                        System.out.print(FoA[1]);
                        System.out.print("   ");
                        System.out.print(FoA_space[1]);

                        System.out.print(" Bick :");
                        System.out.print(FoA[2]);
                        System.out.print("   ");
                        System.out.println(FoA_space[2]);

                    } else if (group == 2) {

                        FoA[1] = FoA[1] + 1;
                        FoA_space[1] = FoA_space[1] - 1;

                        System.out.print("car :");
                        System.out.print(FoA[0]);
                        System.out.print("   ");
                        System.out.print(FoA_space[0]);


                        System.out.print(" van :");
                        System.out.print(FoA[1]);
                        System.out.print("   ");
                        System.out.print(FoA_space[1]);

                        System.out.print(" Bick :");
                        System.out.print(FoA[2]);
                        System.out.print("   ");
                        System.out.println(FoA_space[2]);

                    } else if (group == 3) {

                        FoA[2] = FoA[2] + 1;
                        FoA_space[2] = FoA_space[2] - 1;

                        System.out.print("car :");
                        System.out.print(FoA[0]);
                        System.out.print("   ");
                        System.out.print(FoA_space[0]);


                        System.out.print(" van :");
                        System.out.print(FoA[1]);
                        System.out.print("   ");
                        System.out.print(FoA_space[1]);

                        System.out.print(" Bick :");
                        System.out.print(FoA[2]);
                        System.out.print("   ");
                        System.out.println(FoA_space[2]);

                    }
                    }
                    //########################################
                    else if (6 == option) {

                        System.out.println("Faculty of Low (FOL)");
                        System.out.println("Press 1 to enter car");
                        System.out.println("Press 2 to enter bike");
                        System.out.println("Press 3 to enter van");


                        System.out.print("Bick Space:  ");
                        System.out.println(FoL[0]);
                        System.out.print("car Space:  ");
                        System.out.println(FoL[1]);
                        System.out.print("van Space:  ");
                        System.out.println(FoL[2]);
                        group = park.nextInt();

                        //#####################################################

                        if (group == 1) {
                            FoL[0] = FoL[0] + 1;

                            FoL_space[0] = FoL[0] - 1;
                            System.out.print("car :");
                            System.out.print(FoL[0]);
                            System.out.print("   ");
                            System.out.print(FoL_space[0]);


                            System.out.print(" van :");
                            System.out.print(FoL[1]);
                            System.out.print("   ");
                            System.out.print(FoL_space[1]);

                            System.out.print(" Bick :");
                            System.out.print(FoL[2]);
                            System.out.print("   ");
                            System.out.println(FoL_space[2]);

                        } else if (group == 2) {

                            FoL[1] = FoL[1] + 1;
                            FoL_space[1] = FoL_space[1] - 1;

                            System.out.print("car :");
                            System.out.print(FoL[0]);
                            System.out.print("   ");
                            System.out.print(FoL_space[0]);


                            System.out.print(" van :");
                            System.out.print(FoL[1]);
                            System.out.print("   ");
                            System.out.print(FoL_space[1]);

                            System.out.print(" Bick :");
                            System.out.print(FoL[2]);
                            System.out.print("   ");
                            System.out.println(FoL_space[2]);

                        } else if (group == 3) {

                            FoL[2] = FoL[2] + 1;
                            FoL_space[2] = FoL_space[2] - 1;

                            System.out.print("car :");
                            System.out.print(FoL[0]);
                            System.out.print("   ");
                            System.out.print(FoL_space[0]);


                            System.out.print(" van :");
                            System.out.print(FoL[1]);
                            System.out.print("   ");
                            System.out.print(FoL_space[1]);

                            System.out.print(" Bick :");
                            System.out.print(FoL[2]);
                            System.out.print("   ");
                            System.out.println(FoL_space[2]);


                        }
                    }


                }
            }


        }



