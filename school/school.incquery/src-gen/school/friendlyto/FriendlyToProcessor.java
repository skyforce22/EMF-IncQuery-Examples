package school.friendlyto;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import school.Student;
import school.friendlyto.FriendlyToMatch;

/**
 * A match processor tailored for the school.friendlyTo pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class FriendlyToProcessor implements IMatchProcessor<FriendlyToMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pS1 the value of pattern parameter S1 in the currently processed match 
   * @param pS2 the value of pattern parameter S2 in the currently processed match 
   * 
   */
  public abstract void process(final Student S1, final Student S2);
  
  @Override
  public void process(final FriendlyToMatch match) {
    process(match.getS1(), match.getS2());  				
    
  }
}
