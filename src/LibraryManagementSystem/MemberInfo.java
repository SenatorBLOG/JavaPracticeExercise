package LibraryManagementSystem;

/**
 * Stores personal information of a library member.
 */
public class MemberInfo {
    private String fullName; // Full name of the member
    private String homeAddress; // Home address of the member

    /**
     * Constructs a MemberInfo object with a full name and home address.
     * @param fullName The full name of the member.
     * @param homeAddress The home address of the member.
     */
    public MemberInfo(String fullName, String homeAddress) {
        this.fullName = fullName;
        this.homeAddress = homeAddress;
    }

    public String getFullName() {
        return fullName;
    }
    public String getHomeAddress() {
        return homeAddress;
    }

    /**
     * Displays the member’s name and address.
     */
    public void display() {
        System.out.println("\nName: " + fullName);
        System.out.println("Home address: " + homeAddress);
    }    
}
