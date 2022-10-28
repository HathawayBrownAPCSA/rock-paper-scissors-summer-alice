
/**
 * Class RPSMatch allows for a normal game of Rock, Paper, Scissors
 *
 * @author Summer Mu
 * @version 10.24.2022
 */
public class RPSMatch
{
    private int humanWins;
    private int computerWins;
    private int ties;
    
    private String humanPlay;
    private String computerPlay;

    /**
     * Constructor for objects of class RPSMatch, all set to 0 at the beginning
     */
    public RPSMatch()
    {
        humanWins = 0;
        computerWins = 0;
        ties = 0;
    }

    /**
     * This method sets humanPlay based on which button is clicked by the player
     * @param hp  a string parameter for the method 
     * @return  nothing
     */
    public void setHumanPlay(String hp)
    {
        humanPlay = hp;
    }
    
    /**
     * This method gets the string for computerPlay based on a random number 0-2
     * @param nothing
     * @return "Rock", "Paper", or "Scissors" based on what number math.random chooses
     */
    public String getComputerPlay()
    {
        double r = Math.random() * 3;
        if (r < 1)
        {
            computerPlay = "Rock";
        }
        else if (r < 2)
        {
            computerPlay = "Paper";
        }
        else 
        {
            computerPlay = "Scissors";
        }
        return computerPlay;
    }
    
    /**
     * This method gets the result of the game based on which moves the human and computer play
     * @param nothing
     * @return adds a value to ties, computerWins, or humanWins each time the game is played 
     */
    public String getResult()
    {
        if (humanPlay.compareTo(computerPlay) == 0)
        {
            ties++;
            return "Tie";
        }
        else if ((humanPlay.charAt(0) == 'R' && computerPlay.charAt(0) == 'P')
         || (humanPlay.charAt(0) == 'P' && computerPlay.charAt(0) == 'S')
         || (humanPlay.charAt(0) == 'S' && computerPlay.charAt(0) == 'R')
        )
        {
            computerWins++;
            return "Computer Wins";
        }
        else
        {
            humanWins++;
            return "Human Wins";
        }
    }
    
    /**
     * This method gets the humanWins to update the scores 
     * @param nothing
     * @return number of humanWins based on the results from the getResult method
     */
    public int getHumanWins()
    {
        return humanWins;
    }
    
    /**
     * This method gets the computerWins to update the scores 
     * @param nothing
     * @return number of computerWins based on the results from the getResult method
     */
    public int getComputerWins()
    {
        return computerWins;
    }
    
    /**
     * This method gets the ties to update the scores 
     * @param nothing
     * @return number of ties based on the results from the getResult method
     */
    public int getTies()
    {
        return ties;
    }
}
