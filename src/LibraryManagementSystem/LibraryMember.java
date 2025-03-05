package LibraryManagementSystem;

import java.time.LocalDate;

/**
 * Represents a library member with membership details.
 */
public class LibraryMember {
    private int memberId; // Unique membership ID
    private MemberInfo memberInfo; // Personal information of the member
    private LocalDate regDate; // Registration date

    /**
     * Constructs a LibraryMember with an ID, member info, and registration date.
     * @param memberId The membership ID.
     * @param memberInfo The member's personal information.
     * @param regDate The registration date.
     */
    public LibraryMember(int memberId, MemberInfo memberInfo, LocalDate regDate) {
        this.memberId = memberId;
        this.memberInfo = memberInfo;
        this.regDate = regDate;
    }

    public MemberInfo getMemberInfo() {
        return memberInfo;
    }

    public LocalDate getRegDate() {
        return regDate;
    }
    public int getValue() {
        return memberId;
    }

    /**
     * Displays the member's details including ID and registration date.
     */
    public void display() {
        memberInfo.display();
        System.out.println("Membership ID: " + memberId);
        System.out.println("Registration date: " + regDate);
    }
}
