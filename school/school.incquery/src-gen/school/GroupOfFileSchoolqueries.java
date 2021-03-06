package school;

import org.eclipse.incquery.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import school.classesofschool.ClassesOfSchoolMatcher;
import school.classesofteacher.ClassesOfTeacherMatcher;
import school.classesofteachernames.ClassesOfTeacherNamesMatcher;
import school.courses.CoursesMatcher;
import school.coursesofteacher.CoursesOfTeacherMatcher;
import school.coursesofteachernames.CoursesOfTeacherNamesMatcher;
import school.coursewithnamelongerthanweight.CourseWithNameLongerThanWeightMatcher;
import school.coursewithnamelongerthanweightint.CourseWithNameLongerThanWeightIntMatcher;
import school.coursewithprimeweight.CourseWithPrimeWeightMatcher;
import school.coursewithweightthirty.CourseWithWeightThirtyMatcher;
import school.finalpattern.FinalPatternMatcher;
import school.finalpattern2.FinalPattern2Matcher;
import school.friendlyto.FriendlyToMatcher;
import school.inthecircleoffriends.InTheCircleOfFriendsMatcher;
import school.inthecircleoffriendsnames.InTheCircleOfFriendsNamesMatcher;
import school.morefriendsthan.MoreFriendsThanMatcher;
import school.schools.SchoolsMatcher;
import school.schoolsnames.SchoolsNamesMatcher;
import school.somecourse.SomeCourseMatcher;
import school.studentofschool.StudentOfSchoolMatcher;
import school.studentofschoolnames.StudentOfSchoolNamesMatcher;
import school.teachers.TeachersMatcher;
import school.teachersnames.TeachersNamesMatcher;
import school.teachersofschool.TeachersOfSchoolMatcher;
import school.teachersofschoolnames.TeachersOfSchoolNamesMatcher;
import school.teacherwithoutclass.TeacherWithoutClassMatcher;
import school.teacherwithoutclassnames.TeacherWithoutClassNamesMatcher;
import school.teachesmoreclasses.TeachesMoreClassesMatcher;
import school.teachesthemostcourses.TeachesTheMostCoursesMatcher;
import school.theoneswiththebiggestcircle.TheOnesWithTheBiggestCircleMatcher;
import school.theoneswiththebiggestcirclename.TheOnesWithTheBiggestCircleNameMatcher;

public final class GroupOfFileSchoolqueries extends BaseGeneratedPatternGroup {
  public GroupOfFileSchoolqueries() throws IncQueryException {
    matcherFactories.add(CoursesOfTeacherNamesMatcher.factory());
    matcherFactories.add(TeacherWithoutClassNamesMatcher.factory());
    matcherFactories.add(ClassesOfTeacherNamesMatcher.factory());
    matcherFactories.add(ClassesOfSchoolMatcher.factory());
    matcherFactories.add(TeachersNamesMatcher.factory());
    matcherFactories.add(SchoolsMatcher.factory());
    matcherFactories.add(SomeCourseMatcher.factory());
    matcherFactories.add(TeachersOfSchoolMatcher.factory());
    matcherFactories.add(TeachersMatcher.factory());
    matcherFactories.add(TeachesMoreClassesMatcher.factory());
    matcherFactories.add(FriendlyToMatcher.factory());
    matcherFactories.add(TheOnesWithTheBiggestCircleMatcher.factory());
    matcherFactories.add(SchoolsNamesMatcher.factory());
    matcherFactories.add(TheOnesWithTheBiggestCircleNameMatcher.factory());
    matcherFactories.add(StudentOfSchoolMatcher.factory());
    matcherFactories.add(TeachesTheMostCoursesMatcher.factory());
    matcherFactories.add(StudentOfSchoolNamesMatcher.factory());
    matcherFactories.add(CourseWithNameLongerThanWeightIntMatcher.factory());
    matcherFactories.add(CourseWithNameLongerThanWeightMatcher.factory());
    matcherFactories.add(MoreFriendsThanMatcher.factory());
    matcherFactories.add(TeachersOfSchoolNamesMatcher.factory());
    matcherFactories.add(CourseWithPrimeWeightMatcher.factory());
    matcherFactories.add(CoursesMatcher.factory());
    matcherFactories.add(FinalPattern2Matcher.factory());
    matcherFactories.add(FinalPatternMatcher.factory());
    matcherFactories.add(InTheCircleOfFriendsNamesMatcher.factory());
    matcherFactories.add(ClassesOfTeacherMatcher.factory());
    matcherFactories.add(CourseWithWeightThirtyMatcher.factory());
    matcherFactories.add(InTheCircleOfFriendsMatcher.factory());
    matcherFactories.add(TeacherWithoutClassMatcher.factory());
    matcherFactories.add(CoursesOfTeacherMatcher.factory());
    
  }
}
