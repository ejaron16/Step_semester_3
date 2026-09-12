package week_5_problems.class_problems;

class MovieBookingProfile {
    private String name;
    private boolean confirmed;
    private String otp;

    public MovieBookingProfile() {
    }

    public MovieBookingProfile(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isConfirmed() {
        return this.confirmed;
    }

    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }
}

class Main4 {
    public static void main(String[] args) {
        MovieBookingProfile profile = new MovieBookingProfile("Rahul Dev");
        System.out.println(profile.getName());

        profile.setConfirmed(true);
        System.out.println(profile.isConfirmed());

        profile.setOtp("4471");
    }
}
