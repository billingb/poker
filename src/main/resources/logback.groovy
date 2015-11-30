import ch.qos.logback.classic.encoder.PatternLayoutEncoder
import ch.qos.logback.classic.filter.ThresholdFilter
import ch.qos.logback.core.ConsoleAppender
import ch.qos.logback.core.rolling.FixedWindowRollingPolicy
import ch.qos.logback.core.rolling.RollingFileAppender
import ch.qos.logback.core.rolling.SizeBasedTriggeringPolicy

def appName = "poker"
def host = "${hostname}"

appender("STDOUT", ConsoleAppender) {
  filter(ThresholdFilter) {
    level = INFO
  }
  encoder(PatternLayoutEncoder) {
    pattern = "%5p - %m%n%nopex"
  }
}

appender("FILE", RollingFileAppender) {
  file = "${appName}_${host}.log"
  rollingPolicy(FixedWindowRollingPolicy) {
    minIndex = 1
    maxIndex = 5
    fileNamePattern = "${appName}_${host}_%i.log"
  }
  triggeringPolicy(SizeBasedTriggeringPolicy) {
    maxFileSize = "10MB"
  }
  encoder(PatternLayoutEncoder) {
    pattern = "%d{yy-MM-dd HH:mm:ss.SSS} %5p - [%t] %-40.40logger{39} : %m%n%ex"
  }
}
root(DEBUG, ["FILE"])
logger('games', INFO, ["STDOUT"])
logger('org.gradle', WARN)
logger('org.apache.http', WARN)
logger('org.apache.http.wire', WARN)
logger('org.apache.http.headers', WARN)
logger('groovyx.net.http', WARN)
logger('groovyx.net.http.HttpURLClient', WARN)
logger('org.springframework', INFO)
logger('org.springframework.amqp', WARN)