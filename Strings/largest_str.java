public class largest_str {
    public static void main(String[] args) {
        String[] country = {"india","China","pakisthan","england"};
        String largest = country[0];
        for(int i=0;i<country.length;i++){
            if(largest.compareToIgnoreCase(country[i])<0){
                largest = country[i];
            }
        } System.out.println(largest);
    } 
}
