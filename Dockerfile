FROM anapsix/alpine-java
WORKDIR /app
COPY ./target /target
COPY get-latest-jar.sh .
CMD ["./get-latest-jar.sh"]
