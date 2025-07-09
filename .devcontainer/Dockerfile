FROM mcr.microsoft.com/devcontainers/java:1-21-bullseye as java-tools

SHELL ["/bin/bash", "-euxo", "pipefail", "-c"]

ARG JAVA_24_VERSION='24.0.1+9'

RUN <<EOF
	mkdir -p /tmp/output-java-24/
	wget -qO /tmp/temurin-jdk-24.tar.gz "https://github.com/adoptium/temurin24-binaries/releases/download/jdk-${JAVA_24_VERSION}/OpenJDK24U-jdk_x64_linux_hotspot_${JAVA_24_VERSION//+/_}.tar.gz"
	tar -xzf /tmp/temurin-jdk-24.tar.gz -C /tmp/output-java-24 --strip-components 1 --no-same-owner
	/tmp/output-java-24/bin/javac -version
	/tmp/output-java-24/bin/java -version
EOF

FROM mcr.microsoft.com/devcontainers/java:1-21-bullseye as devcontainer

COPY --from=java-tools /tmp/output-java-24/ /opt/java/temurin-jdk-24/

ENV JAVA_24_HOME=/opt/java/temurin-jdk-24
# ENV JAVA_HOME="${JAVA_24_HOME}"
# ENV PATH="${JAVA_24_HOME}/bin:${PATH}"
