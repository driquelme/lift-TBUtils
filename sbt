java -XX:+CMSClassUnloadingEnabled -XX:MaxPermSize=256m -Xmx512M -Xss2M -jar `dirname $0`/sbt-launch-0.12.2.jar "$@"
