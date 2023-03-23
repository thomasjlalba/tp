package chching.command;


import chching.Storage;
import chching.Ui;
import chching.currency.Converter;
import chching.currency.Selector;
import chching.record.ExpenseList;
import chching.record.IncomeList;

/**
 * Models a class that clears the entire incomeList. Inherited from Command class.
 */
public class ClearIncomeCommand extends Command{

    /**
     * Clears the incomeList
     */
    public void execute(IncomeList incomes, ExpenseList expenses, Ui ui, Storage storage, Selector selector,
                        Converter converter) {
        incomes.clearIncomeList();
    }
}
