class GymRunner{
    public static void main(String[] args){

        Gym gym = new Gym();
        gym.gymName = "Gold Gym";
        gym.location = "BTM";

        Trainer t = new Trainer();
        gym.trainer = t;

        t.trainerName = "Arjun";
        t.experience = 5;

        gym.getGymDetails();
    }
}