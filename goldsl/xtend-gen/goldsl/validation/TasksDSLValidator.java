/**
 * generated by Xtext 2.28.0
 */
package goldsl.validation;

import goldsl.tasksDSL.Cell;
import goldsl.tasksDSL.FillCell;
import goldsl.tasksDSL.GameOfLife;
import goldsl.tasksDSL.Grid;
import goldsl.tasksDSL.NormalCell;
import goldsl.tasksDSL.Rule;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.validation.Check;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class TasksDSLValidator extends AbstractTasksDSLValidator {
  @Check
  public void checkFillCellsAmount(final FillCell fillCell) {
    int _repAmount = fillCell.getRepAmount();
    boolean _greaterThan = (_repAmount > 1);
    boolean _not = (!_greaterThan);
    if (_not) {
      this.warning("The repetition amount should be greater than 1", null);
    }
  }

  @Check
  public void checkSurroundingssAmount(final Rule rule) {
    if (((rule.getN() > 8) || (rule.getN() < 0))) {
      this.error("A cell can only have between 0 and 8 neighbours", null);
    }
  }

  @Check
  public void checkGridIsSpecified(final Grid grid) {
    if ((grid == null)) {
      this.info("You can specify your own grid size with \'Grid width: x height: y\'", null);
    }
  }

  @Check
  public void checkGridSize(final Grid grid) {
    int boundary = 10;
    if (((grid.getWidth() < boundary) || (grid.getHeight() < boundary))) {
      this.error("Minimum size of the grid should be 10x10", null);
    }
  }

  @Check
  public void checkCellAreWithinBoundaries(final GameOfLife root) {
    Grid grid = root.getGrid();
    EList<Cell> _cells = root.getCells();
    for (final Cell cells : _cells) {
      EList<NormalCell> _nCells = cells.getNCells();
      for (final NormalCell nCell : _nCells) {
        if (((nCell.getX() > grid.getWidth()) || (nCell.getY() > grid.getHeight()))) {
          this.error("Specified cell(s) are outside the grid", null);
        }
      }
    }
  }
}
