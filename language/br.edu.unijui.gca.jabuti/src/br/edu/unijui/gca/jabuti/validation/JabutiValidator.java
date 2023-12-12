/*
 * generated by Xtext 2.28.0
 */
package br.edu.unijui.gca.jabuti.validation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;

import com.google.common.base.Objects;

import br.edu.unijui.gca.jabuti.jabuti.Clause;
import br.edu.unijui.gca.jabuti.jabuti.Contract;
import br.edu.unijui.gca.jabuti.jabuti.JabutiPackage;
import br.edu.unijui.gca.jabuti.jabuti.TimeInterval;

/**
 * This class contains custom validation rules.
 *
 * See
 * https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class JabutiValidator extends AbstractJabutiValidator {

	public static final String INVALID_NAME = "invalidName";
	public static final String DUPLICATE_NAME = "Duplicated name";

	@Check
	public void checkNameStartsWithCapital(Contract contract) {
		if (!Character.isUpperCase(contract.getName().charAt(0))) {
			warning("Name should start with a capital", JabutiPackage.Literals.CONTRACT__NAME, INVALID_NAME);
		}
	}

	@Check
	public void checkNameStartsWithLowerCase(Clause clause) {
		if (!Character.isLowerCase(clause.getName().charAt(0))) {
			warning("Name should not start with a capital", JabutiPackage.Literals.CLAUSE__NAME, INVALID_NAME);
		}
	}

	@Check
	public void checkClauseNameIsUnique(Clause clause) {

		if (clause != null) {
			EList<Clause> clauses = ((Contract) clause.eContainer()).getClauses();
			int count = 0;
			for (Clause otherClause : clauses) {
				if (Objects.equal(otherClause.getName(), clause.getName())) {
					count += 1;
					if (count == 2) {
						error(DUPLICATE_NAME, JabutiPackage.Literals.CLAUSE__NAME);
					}
				}
			}
		}
	}

	
	@Check
	public void checkTimeInTimeInterval(TimeInterval time) {
				
		String startTime = time.getStart();
		String endTime =  time.getEnd();
		
		if (startTime != null) {
			if(!startTime.matches("\\d{2}:\\d{2}:\\d{2}")) {
					error("Time format invalid. Provide the format: HH:mm:ss", JabutiPackage.Literals.TIME_INTERVAL__START); 
			}	
		}
		if(endTime != null) {
			if(!endTime.matches("\\d{2}:\\d{2}:\\d{2}")) {
				error("Time format invalid. Provide the format: HH:mm:ss", JabutiPackage.Literals.TIME_INTERVAL__END); 
			}
		}
	}
	
	@Check(CheckType.NORMAL)
	public void checkDate(Contract contract) {

		String beginDate = contract.getBeginDate();
		String dueDate = contract.getDueDate();

		if (beginDate != null) {
			if (!beginDate.matches("\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}")) {
				error("DateTime invalid. Provide the format: YYYY-MM-DD HH:mm:ss", JabutiPackage.Literals.CONTRACT__BEGIN_DATE);
			}
		}
		
		if (dueDate != null) {
			if (!dueDate.matches("\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}")) {
				error("DateTime invalid. Provide the format:  YYYY-MM-DD HH:mm:ss", JabutiPackage.Literals.CONTRACT__DUE_DATE);
			}
		}
	}

}