package hu.bme.mit.ecorequery.tests

import com.google.inject.Inject
import hu.bme.mit.incquery.ecorequeries.example.eclass.EClassMatcherFactory
import hu.bme.mit.incquery.ecorequeries.example.eclassattribute.EClassAttributeMatcherFactory
import hu.bme.mit.incquery.ecorequeries.example.eclasswithestringattribute.EClassWithEStringAttributeMatcherFactory
import hu.bme.mit.incquery.ecorequeries.example.ecorenamedelement.ECoreNamedElementMatcherFactory
import hu.bme.mit.incquery.ecorequeries.example.eobject.EObjectMatcherFactory
import hu.bme.mit.incquery.ecorequeries.example.ereferencewithonemultiplicity.EReferenceWithOneMultiplicityMatcherFactory
import hu.bme.mit.incquery.ecorequeries.example.ereferencewithstarmultiplicity.EReferenceWithStarMultiplicityMatcherFactory
import hu.bme.mit.incquery.ecorequeries.example.isestring.IsEStringMatcherFactory
import hu.bme.mit.incquery.ecorequeries.example.isinecore.IsInECoreMatcherFactory
import hu.bme.mit.incquery.ecorequeries.example.samplequery.SampleQueryMatcherFactory
import hu.bme.mit.incquery.ecorequeries.example.samplequery2.SampleQuery2MatcherFactory
import hu.bme.mit.incquery.ecorequeries.example.supertypeof.SuperTypeOfMatcherFactory
import org.eclipse.incquery.testing.core.TestExecutor
import org.eclipse.incquery.testing.core.injector.EMFPatternLanguageInjectorProvider
import org.eclipse.incquery.patternlanguage.emf.eMFPatternLanguage.PatternModel
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.Ignore

/**
 * Basic test set for testing IncQuery with the ECore Queries example.
 * These tests just perform a simple match set check against all the queries in the ECore Queries example.
 * See http://viatra.inf.mit.bme.hu/incquery/new/examples/ecorequery for details on the example.
 */
@RunWith(typeof(XtextRunner))
@InjectWith(typeof(EMFPatternLanguageInjectorProvider))
class EcorequeriesBasicTest extends EcorequeryBaseTest {
	
	@Inject extension TestExecutor
	
	@Inject
	ParseHelper parseHelper


	// parse pattern from URI, load expected from URI, assertMatchResults, CORRECT
	@Test
	def testAllQueriesXMI(){
		assertMatchResults(queryInputXMI, snapshot)
	}
	
	// parse pattern from EIQ, load expected from URI, assertMatchResults, CORRECT
	@Test@Ignore("Not working on the build as eiq files are not packaged into jar.")
	def testAllQueriesEIQ(){
		assertMatchResults(queryInputEIQ, snapshot)
	}
		
	// simple test cases, for each query of the school example
	 
	@Test def testEObject() { testQuery("hu.bme.mit.incquery.ecorequeries.example.EObject") }
	@Test def testEClass() { testQuery("hu.bme.mit.incquery.ecorequeries.example.EClass") }
	@Test def testSuperTypeOf() { testQuery("hu.bme.mit.incquery.ecorequeries.example.SuperTypeOf") }
	@Test def testEClassAttribute() { testQuery("hu.bme.mit.incquery.ecorequeries.example.EClassAttribute") }
	@Test def testEClassWithEStringAttribute() { testQuery("hu.bme.mit.incquery.ecorequeries.example.EClassWithEStringAttribute") }
	@Test def testEReferenceWithStarMultiplicity() { testQuery("hu.bme.mit.incquery.ecorequeries.example.EReferenceWithStarMultiplicity") }
	@Test def testEReferenceWithOneMultiplicity() { testQuery("hu.bme.mit.incquery.ecorequeries.example.EReferenceWithOneMultiplicity") }
	@Test def testSampleQuery() { testQuery("hu.bme.mit.incquery.ecorequeries.example.SampleQuery") }
	@Test def testSampleQuery2() { testQuery("hu.bme.mit.incquery.ecorequeries.example.SampleQuery2") }
	@Test def testIsEString() { testQuery("hu.bme.mit.incquery.ecorequeries.example.IsEString") }
	@Test def testECoreNamedElement() { testQuery("hu.bme.mit.incquery.ecorequeries.example.ECoreNamedElement") }
	@Test def testIsInECore() { testQuery("hu.bme.mit.incquery.ecorequeries.example.IsInECore") }

	@Test def mfTestEObject() { testQuery(EObjectMatcherFactory::instance) }
	@Test def mfTestEClass() { testQuery(EClassMatcherFactory::instance) }
	@Test def mfTestSuperTypeOf() { testQuery(SuperTypeOfMatcherFactory::instance) }
	@Test def mfTestEClassAttribute() { testQuery(EClassAttributeMatcherFactory::instance) }
	@Test def mfTestEClassWithEStringAttribute() { testQuery(EClassWithEStringAttributeMatcherFactory::instance) }
	@Test def mfTestEReferenceWithStarMultiplicity() { testQuery(EReferenceWithStarMultiplicityMatcherFactory::instance) }
	@Test def mfTestEReferenceWithOneMultiplicity() { testQuery(EReferenceWithOneMultiplicityMatcherFactory::instance) }
	@Test def mfTestSampleQuery() { testQuery(SampleQueryMatcherFactory::instance) }
	@Test def mfTestSampleQuery2() { testQuery(SampleQuery2MatcherFactory::instance) }
	@Test def mfTestIsEString() { testQuery(IsEStringMatcherFactory::instance) }
	@Test def mfTestECoreNamedElement() { testQuery(ECoreNamedElementMatcherFactory::instance) }
	@Test def mfTestIsInECore() { testQuery(IsInECoreMatcherFactory::instance) }
	
	
	@Test
	def simpleCorrectTest_EClass(){
		val patternModel = parseHelper.parse('
			package hu.bme.mit.incquery.ecorequeries.example

			import "http://www.eclipse.org/emf/2002/Ecore"

			pattern EClass(EClass) = {
				EClass(EClass);
			}
		') as PatternModel
		patternModel.assertMatchResults("hu.bme.mit.ecorequery.tests/model/tests_EClass.eiqsnapshot")
	}
	
	@Test
	def simpleCorrectTest_EReferenceWithStarMultiplicity(){
		val patternModel = parseHelper.parse('
			package hu.bme.mit.incquery.ecorequeries.example

			import "http://www.eclipse.org/emf/2002/Ecore"

			pattern EReferenceWithStarMultiplicity(ERef) = {
				EReference(ERef);
				ETypedElement.lowerBound(ERef,0); 
				ETypedElement.upperBound(ERef,-1);
			}
		') as PatternModel
		patternModel.assertMatchResults("hu.bme.mit.ecorequery.tests/model/tests_ereferencedWithStarMultiplicity.eiqsnapshot")
	}

}