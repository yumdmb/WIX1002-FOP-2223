package lab3;

import java.util.Random;

class l3q2 {
    public static void main(String[] args) {
        Random rng = new Random();
        int num = rng.nextInt(5);

        if (num == 0) {
            System.out.printf("%d is zero.", num);
        } else if (num == 1) {
            System.out.printf("%d is one.", num);
        } else if (num == 2) {
            System.out.printf("%d is two.", num);
        } else if (num == 3) {
            System.out.printf("%d is three.", num);
        } else if (num == 4) {
            System.out.printf("%d is four.", num);
        } else if (num == 5) {
            System.out.printf("%d is five.", num);
        }
    }
}   

// switch (num) {
//            case 0:
//                System.out.printf("%d is zero.", num);
//                break;
//            case 1:
//                System.out.printf("%d is one.", num);
//                break;
//            case 2:
//                System.out.printf("%d is two.", num);
//                break;
//            case 3:
//                System.out.printf("%d is three.", num);
//                break;
//            case 4:
//                System.out.printf("%d is four.", num);
//                break;
//            case 5:
//                System.out.printf("%d is five.", num);
//                break;
//            default:
//                break;
//        }