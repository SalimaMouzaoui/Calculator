package dz.selma.calculator.calcul.service;

import java.util.List;
import java.util.stream.Stream;

import dz.selma.calculator.calcul.domain.model.CalculationModel;

public interface BatchCalculatorService {
	public List<CalculationModel> batchCalculate(Stream<String> operations);
}
