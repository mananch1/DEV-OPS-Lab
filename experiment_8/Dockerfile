FROM nginx:alpine

LABEL author="Manan"

WORKDIR /usr/share/nginx/html

RUN rm -f index.html

COPY ./src/static/index.html .

ENV APP_VERSION=1.0

EXPOSE 80

CMD ["nginx","-g","daemon off;"]