/**
 * Created by vicboma on 27/10/15.
 */
/**
 * The primary constructor needs to have at least one parameter;
 * All primary constructor parameters need to be marked as val or var;
 * Data classes cannot be abstract, open, sealed or inner;
 * Data classes may not extend other classes (but may implement interfaces).
 */
data public class DataCustomer(val id : Int, val name : String, val email : String) {
}