package hu.bme.mit.incquery.ecorequeries.example.eclass;

import hu.bme.mit.incquery.ecorequeries.example.eclass.EClassMatch;
import hu.bme.mit.incquery.ecorequeries.example.eclass.EClassMatcherFactory;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.incquery.runtime.api.EngineManager;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.api.IMatcherFactory;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcher;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.rete.misc.DeltaMonitor;
import org.eclipse.incquery.runtime.rete.tuple.Tuple;

/**
 * Generated pattern matcher API of the hu.bme.mit.incquery.ecorequeries.example.EClass pattern, 
 * providing pattern-specific query methods.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern EClass(EClass) = {
 * 	EClass(EClass);
 * }
 * </pre></code>
 * 
 * @see EClassMatch
 * @see EClassMatcherFactory
 * @see EClassProcessor
 * 
 */
public class EClassMatcher extends BaseGeneratedMatcher<EClassMatch> {
  private final static int POSITION_ECLASS = 0;
  
  /**
   * Initializes the pattern matcher over a given EMF model root (recommended: Resource or ResourceSet). 
   * If a pattern matcher is already constructed with the same root, only a lightweight reference is created.
   * The scope of pattern matching will be the given EMF model root and below (see FAQ for more precise definition).
   * The match set will be incrementally refreshed upon updates from this scope.
   * <p>The matcher will be created within the managed {@link IncQueryEngine} belonging to the EMF model root, so 
   * multiple matchers will reuse the same engine and benefit from increased performance and reduced memory footprint.
   * @param emfRoot the root of the EMF containment hierarchy where the pattern matcher will operate. Recommended: Resource or ResourceSet.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public EClassMatcher(final Notifier emfRoot) throws IncQueryException {
    this(EngineManager.getInstance().getIncQueryEngine(emfRoot));
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine. 
   * If the pattern matcher is already constructed in the engine, only a lightweight reference is created.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public EClassMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, factory());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pEClass the fixed value of pattern parameter EClass, or null if not bound.
   * @return matches represented as a EClassMatch object.
   * 
   */
  public Collection<EClassMatch> getAllMatches(final EClass pEClass) {
    return rawGetAllMatches(new Object[]{pEClass});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pEClass the fixed value of pattern parameter EClass, or null if not bound.
   * @return a match represented as a EClassMatch object, or null if no match is found.
   * 
   */
  public EClassMatch getOneArbitraryMatch(final EClass pEClass) {
    return rawGetOneArbitraryMatch(new Object[]{pEClass});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pEClass the fixed value of pattern parameter EClass, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final EClass pEClass) {
    return rawHasMatch(new Object[]{pEClass});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pEClass the fixed value of pattern parameter EClass, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final EClass pEClass) {
    return rawCountMatches(new Object[]{pEClass});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pEClass the fixed value of pattern parameter EClass, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final EClass pEClass, final IMatchProcessor<? super EClassMatch> processor) {
    rawForEachMatch(new Object[]{pEClass}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.  
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pEClass the fixed value of pattern parameter EClass, or null if not bound.
   * @param processor the action that will process the selected match. 
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final EClass pEClass, final IMatchProcessor<? super EClassMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pEClass}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters. 
   * It can also be reset to track changes from a later point in time, 
   * and changes can even be acknowledged on an individual basis. 
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pEClass the fixed value of pattern parameter EClass, or null if not bound.
   * @return the delta monitor.
   * 
   */
  public DeltaMonitor<EClassMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final EClass pEClass) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pEClass});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher. 
   * This can be used e.g. to call the matcher with a partial match. 
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pEClass the fixed value of pattern parameter EClass, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public EClassMatch newMatch(final EClass pEClass) {
    return new EClassMatch.Immutable(pEClass);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for EClass.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<EClass> rawAccumulateAllValuesOfEClass(final Object[] parameters) {
    Set<EClass> results = new HashSet<EClass>();
    rawAccumulateAllValues(POSITION_ECLASS, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for EClass.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EClass> getAllValuesOfEClass() {
    return rawAccumulateAllValuesOfEClass(emptyArray());
  }
  
  @Override
  protected EClassMatch tupleToMatch(final Tuple t) {
    try {
    	return new EClassMatch.Immutable((org.eclipse.emf.ecore.EClass) t.get(POSITION_ECLASS));	
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in tuple not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  protected EClassMatch arrayToMatch(final Object[] match) {
    try {
    	return new EClassMatch.Immutable((org.eclipse.emf.ecore.EClass) match[POSITION_ECLASS]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  protected EClassMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return new EClassMatch.Mutable((org.eclipse.emf.ecore.EClass) match[POSITION_ECLASS]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  /**
   * @return the singleton instance of the factory of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IMatcherFactory<EClassMatcher> factory() throws IncQueryException {
    return EClassMatcherFactory.instance();
  }
}
