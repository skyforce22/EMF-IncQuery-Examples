package hu.bme.mit.incquery.ecorequeries.example.samplequery;

import hu.bme.mit.incquery.ecorequeries.example.samplequery.SampleQueryMatch;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.incquery.ecorequeries.example.SampleQuery pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
public abstract class SampleQueryProcessor implements IMatchProcessor<SampleQueryMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pXElement the value of pattern parameter XElement in the currently processed match 
   * @param pYElement the value of pattern parameter YElement in the currently processed match 
   * @param pRelates the value of pattern parameter Relates in the currently processed match 
   * @param pLabel1 the value of pattern parameter Label1 in the currently processed match 
   * @param pLabel2 the value of pattern parameter Label2 in the currently processed match 
   * 
   */
  public abstract void process(final EClass XElement, final EClass YElement, final EReference Relates, final EAttribute Label1, final EAttribute Label2);
  
  @Override
  public void process(final SampleQueryMatch match) {
    process(match.getXElement(), match.getYElement(), match.getRelates(), match.getLabel1(), match.getLabel2());  				
    
  }
}
