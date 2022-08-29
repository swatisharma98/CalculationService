# CalculationService
Microservice to calculate the total price of the product.Spring Cloud Microservice.

# RestTemplate
Rest Template is used to create applications that consume RESTful Web Services.

restTemplate.getForObject("http://localhost:9091/item/{item}/quant/{quant}", CalculationPojo.class, item, quant);

# Feign
Feign is a declarative web service client.It makes writing web service clients easier. To use Feign create an interface and annotate it @FeignClient(name = "ItemPriceService").

