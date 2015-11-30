import ch.qos.logback.classic.encoder.PatternLayoutEncoder
import ch.qos.logback.core.ConsoleAppender

def appName = "poker"
def host = "${hostname}"

appender("CONSOLE", ConsoleAppender) {
  encoder(PatternLayoutEncoder) {
    pattern = "%d{yy-MM-dd HH:mm:ss.SSS} %5p - [%t] %-40.40logger{39} : %m%n%ex"
  }
}
root(DEBUG, ["CONSOLE"])
logger('org.gradle', WARN)
logger('org.apache.http', WARN)
logger('org.apache.http.wire', WARN)
logger('org.apache.http.headers', WARN)
logger('groovyx.net.http', WARN)
logger('groovyx.net.http.HttpURLClient', WARN)
logger('org.springframework', INFO)
logger('org.springframework.amqp', WARN)