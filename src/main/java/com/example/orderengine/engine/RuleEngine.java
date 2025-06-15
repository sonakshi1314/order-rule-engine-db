package com.example.orderengine.engine;

import com.example.orderengine.model.Order;
import com.example.orderengine.model.Rule;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class RuleEngine {

    private final ExpressionParser parser = new SpelExpressionParser();

    public Optional<String> evaluate(Order order, List<Rule> rules) {
        StandardEvaluationContext ctx = new StandardEvaluationContext();
        ctx.setVariable("order", order);

        for (Rule rule : rules) {
            Boolean match = parser.parseExpression(rule.getCondition())
                    .getValue(ctx, Boolean.class);
            if (Boolean.TRUE.equals(match)) {
                return Optional.of(rule.getCourierPartner());
            }
        }
        return Optional.empty();
    }
}
