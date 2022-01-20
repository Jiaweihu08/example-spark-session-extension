package extensions

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.catalyst.plans.logical.{LogicalPlan, Sample}
import org.apache.spark.sql.catalyst.rules.Rule

class MyOptimizationRule(spark: SparkSession) extends Rule[LogicalPlan] {

  override def apply(plan: LogicalPlan): LogicalPlan = {

    plan transformDown { case s @ Sample(_,0.1,_,_,_) =>
      s.copy(upperBound = 0.2)
    }
  }
}
