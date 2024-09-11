/**
 * generated by Xtext
 */
package net.sf.orcc.cal.validation;

import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import net.sf.orcc.cal.cal.AstEntity;
import net.sf.orcc.cal.services.TypeCycleDetector;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;

/**
 * This class describes the validation of an RVC-CAL actor. The checks tagged as
 * "normal" are only performed when the file is saved and before code
 * generation.
 * 
 * 
 * @author Matthieu Wipliez
 * @author Endri Bezati
 */
@SuppressWarnings("all")
public class CalValidator extends AbstractCalValidator {
  @Inject
  private StructuralValidator structuralValidator;
  
  @Inject
  private WarningValidator warningValidator;
  
  @Inject
  private TypeValidator typeValidator;
  
  @Check(CheckType.NORMAL)
  public void checkAstEntity(final AstEntity entity) {
    List<ValidationError> errors = new ArrayList<ValidationError>(0);
    boolean _detectCycles = new TypeCycleDetector().detectCycles(entity, errors);
    if (_detectCycles) {
      this.showErrors(errors);
      return;
    }
    this.structuralValidator.validate(entity, this.getChain(), this.getContext());
    this.typeValidator.validate(entity, this.getChain(), this.getContext());
    this.warningValidator.validate(entity, this.getChain(), this.getContext());
  }
  
  public void showErrors(final List<ValidationError> errors) {
    for (final ValidationError error : errors) {
      this.error(error.getMessage(), error.getSource(), error.getFeature(), 
        error.getIndex());
    }
  }
}
