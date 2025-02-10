package streams;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class Transaction{
	
	private ZonedDateTime date;
	private Double txAmnt;
	
	
	public Transaction(ZonedDateTime date, Double txAmnt) {
		super();
		this.date = date;
		this.txAmnt = txAmnt;
	}
	
	public ZonedDateTime getDate() {
		return date;
	}
	public void setDate(ZonedDateTime date) {
		this.date = date;
	}
	public Double getTxAmnt() {
		return txAmnt;
	}
	public void setTxAmnt(Double txAmnt) {
		this.txAmnt = txAmnt;
	}
	
	
	
	
}
public class SummingTransactionPerday {
	
	
public static void main(String[] args) {
	
	List<Transaction> transactions = Arrays.asList(
		    new Transaction(ZonedDateTime.of(2024, 2, 6, 10, 30, 0, 0, ZoneId.of("Asia/Tokyo")), 100.0),
		    new Transaction(ZonedDateTime.of(2024, 2, 6, 10, 30, 0, 0, ZoneId.of("Asia/Tokyo")), 200.0),
		    new Transaction(ZonedDateTime.of(2023, 2, 6, 10, 30, 0, 0, ZoneId.of("Asia/Tokyo")), 300.0),
		    new Transaction(ZonedDateTime.of(2023, 2, 6, 10, 30, 0, 0, ZoneId.of("Asia/Tokyo")), 400.0),
		    new Transaction(ZonedDateTime.of(2023, 2, 6, 10, 30, 0, 0, ZoneId.of("Asia/Tokyo")), 500.0)
		);
	
	Map<ZonedDateTime, Double> txMap =  transactions.stream().collect(Collectors.groupingBy(Transaction::getDate, Collectors.averagingDouble(Transaction::getTxAmnt)));

	txMap.forEach((a,b) -> System.out.println("Transaction date : " + a  + "average amount : " + b ));
}
}
