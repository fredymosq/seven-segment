import java.util.*;

public class SevenSegment {

    public static void main(String[] args) {

        String number = "000.88";
        digitToSevenSegment(number);
    }

    private static void digitToSevenSegment(String number) {

        Map<String, List<String>> representation = new HashMap<>();
        representation.put("0", Arrays.asList("#######", "#     #", "#     #", "#     #", "#######"));
        representation.put("1", Arrays.asList("      #", "      #", "      #", "      #", "      #"));
        representation.put("2", Arrays.asList("#######", "      #", "#######", "#      ", "#######"));
        representation.put("3", Arrays.asList("#######", "      #", "#######", "      #", "#######"));
        representation.put("4", Arrays.asList("#     #", "#     #", "#######", "      #", "      #"));
        representation.put("5", Arrays.asList("#######", "#      ", "#######", "      #", "#######"));
        representation.put("6", Arrays.asList("#      ", "#      ", "#######", "#     #", "#######"));
        representation.put("7", Arrays.asList("#######", "      #", "      #", "      #", "      #"));
        representation.put("8", Arrays.asList("#######", "#     #", "#######", "#     #", "#######"));
        representation.put("9", Arrays.asList("#######", "#     #", "#######", "      #", "#######"));
        representation.put(".", Arrays.asList("       ", "       ", "       ", "       ", "      #"));

        List<List<String>> segments = new ArrayList<>();
        for (int i = 0; i <  number.length(); i++) {
            segments.add(representation.get(String.valueOf(number.charAt(i))));

        }

        for (int i = 0; i <  5; i++) {
            StringBuilder segmentToPrint = new StringBuilder();
            for (List<String> segment : segments){
                segmentToPrint.append(segment.get(i)).append("   ");
            }
            System.out.println(segmentToPrint.toString());
        }





    }
}
/*
#######
#     #
#     #
#     #
#######
----------
      #
      #
      #
      #
      #
---------
#######
      #
#######
#
#######
--------------

#######
      #
#######
      #
#######

-----------
#     #
#     #
#######
      #
      #
------------
#######
#
#######
      #
#######
---------
#
#
#######
#     #
#######
--------
#######
      #
      #
      #
      #
---------
#######
#     #
#######
#     #
#######
---------
#######
#     #
#######
      #
#######
----------


sev

      #
 */
